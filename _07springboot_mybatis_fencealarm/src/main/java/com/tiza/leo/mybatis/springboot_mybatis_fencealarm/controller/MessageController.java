package com.tiza.leo.mybatis.springboot_mybatis_fencealarm.controller;

import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.config.BaseResult;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.model.Message;
import com.tiza.leo.mybatis.springboot_mybatis_fencealarm.repository.MessageRepository;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Author: tz_wl
 * Date: 2020/11/25 14:43
 * Content:
 */
@Api(value = "消息",description = "消息操作API",position = 100,protocols = "http")
@RestController
@RequestMapping("/msg")
public class MessageController {

    @Autowired
    private MessageRepository messageRepository;

    @ApiOperation(value = "自动创建消息",notes = "自动创建50条消息,没有参数",code = 200)

    @GetMapping(value="messageMock50")
    public BaseResult<Message> createTop50(){

        //限制最多100条
           int count=50;
        Message message =new Message();
        for(int i=0;i<count;i++){
            message=new Message();
            message.setId((long) i);
            message.setSummary("summary"+i);
            message.setText("text"+i);
            message = this.messageRepository.save(message);
        }
        return BaseResult.successWithData(message);
    }



    @ApiOperation(
            value = "消息列表",
            notes = "完整的消息内容列表",
            produces = "application/json, application/xml",
            consumes = "application/json, application/xml",
            response = List.class,
            code = 200)
    @GetMapping(value = "listMsg")
    public BaseResult<List<Message>> list(){
        List<Message> listMessage = this.messageRepository.findAll();
        return BaseResult.successWithData(listMessage);
    }


    @ApiImplicitParams({
            @ApiImplicitParam(name = "id", value = "消息ID", required = true, dataType = "Long", paramType = "query"),
            @ApiImplicitParam(name = "text", value = "消息正文", required = true, dataType = "String", paramType = "query"),
            @ApiImplicitParam(name = "summary", value = "摘要", required = false, dataType = "String", paramType = "query"),
    })
    @PostMapping(value="message")
    public BaseResult<Message> create(Message message){
        message = this.messageRepository.save(message);
        return BaseResult.successWithData(message);
    }


    @ApiOperation(value = "修改信息", notes = "根据参数修改信息")
    @ApiResponses({
            @ApiResponse(code = 100, message = "请求信息有误"),
            @ApiResponse(code = 101, message = "未授权"),
            @ApiResponse(code = 103, message = "禁止访问"),
            @ApiResponse(code = 104, message = "请求路径不存在"),
            @ApiResponse(code = 200, message = "服务器内部错误"),
    })
    @PutMapping(value = "message")
    public BaseResult<Message> modify(Message message) {
        Message messageResult=this.messageRepository.update(message);
        return BaseResult.successWithData(messageResult);
    }


    @PatchMapping(value="/message/text")
    public BaseResult<Message> patch(Message message) {
        Message messageResult=this.messageRepository.updateText(message);
        return BaseResult.successWithData(messageResult);
    }


    @ApiOperation(
            value = "查询单个消息",
            notes = "单个消息的详细信息",
            response = BaseResult.class,
            code = 200
    )
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "消息的id",required = true, dataType = "Long", paramType = "path")
    })
    @GetMapping(value = "message/{id}")
    public BaseResult<Message> get(@PathVariable Long id) {
        Message message = this.messageRepository.findMessage(id);
        return BaseResult.successWithData(message);
    }



    @ApiOperation(value = "删除消息",notes = "根据id删除消息",code = 200)
    @ApiImplicitParams({
            @ApiImplicitParam(name = "id",value = "消息的id",required = true, dataType = "Long", paramType = "path")
    })
    @DeleteMapping(value = "message/{id}")
    public BaseResult delete(@PathVariable("id") Long id) {
        this.messageRepository.deleteMessage(id);
        return BaseResult.success();
    }


}
