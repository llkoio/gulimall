package com.atguigu.gulimall.auth.feign;

import com.atguigu.gulimall.authserver.vo.SocialUser;
import com.atguigu.gulimall.authserver.vo.UserLoginVO;
import com.atguigu.gulimall.authserver.vo.UserRegisterVO;
import edu.dlut.common.utils.R;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

/**
 * @AUTHOR: raymond
 * @DATETIME: 2020/5/17  21:02
 * DESCRIPTION:
 **/
@FeignClient("mall-member")
public interface MemberFeign {

    @PostMapping("/member/member/register")
    R register(@RequestBody UserRegisterVO userRegisterVO);

    @PostMapping("/member/member/login")
    R login(@RequestBody UserLoginVO userLoginVO);

    @PostMapping("/member/member/oauth2/login")
    R oauthLogin(@RequestBody SocialUser socialUser) throws Exception;

}
