package com.tiza.leo.springdatajpa.servic;

import com.mysql.cj.util.StringUtils;
//import com.mysql.jdbc.StringUtils;
import com.tiza.leo.springdatajpa.model.UserDetail;
import com.tiza.leo.springdatajpa.param.UserDetailParam;
import com.tiza.leo.springdatajpa.repository.UserDetailRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.persistence.criteria.Predicate;
import java.util.ArrayList;
import java.util.List;

/**
 * @author leowei
 * @date 2020/11/25  - 21:25
 */
@Service
public class UserDetailServiceImpl implements UserDetailService {

    @Resource
    private UserDetailRepository userDetailRepository;

    @Override
    public Page<UserDetail> findByCondition(UserDetailParam detailParam, Pageable pageable){

        return userDetailRepository.findAll((root, query, cb) -> {
            List<Predicate> predicates = new ArrayList<>();
            //equal 示例
            if (!StringUtils.isNullOrEmpty(detailParam.getIntroduction())){
                predicates.add(cb.equal(root.get("introduction"),detailParam.getIntroduction()));
            }
            //like 示例
            if (!StringUtils.isNullOrEmpty(detailParam.getRealName())){
                predicates.add(cb.like(root.get("realName"),"%"+detailParam.getRealName()+"%"));
            }
            //between 示例
            if (detailParam.getMinAge()!=null && detailParam.getMaxAge()!=null) {
                Predicate agePredicate = cb.between(root.get("age"), detailParam.getMinAge(), detailParam.getMaxAge());
                predicates.add(agePredicate);
            }
            //greaterThan 大于等于示例
            /*if (detailParam.getMinAge()!=null){
                predicates.add(cb.greaterThan(root.get("age"),detailParam.getMinAge()));
            }*/
            return query.where(predicates.toArray(new Predicate[predicates.size()])).getRestriction();
        }, pageable);

    }

}
