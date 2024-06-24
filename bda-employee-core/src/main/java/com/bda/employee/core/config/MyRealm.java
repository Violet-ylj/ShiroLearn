package com.bda.employee.core.config;

import org.apache.shiro.authc.*;
import org.apache.shiro.authz.AuthorizationInfo;
import org.apache.shiro.realm.AuthorizingRealm;
import org.apache.shiro.subject.PrincipalCollection;

public class MyRealm extends AuthorizingRealm {

    @Override
    protected AuthenticationInfo doGetAuthenticationInfo(AuthenticationToken authenticationToken) throws AuthenticationException {
        // 处理身份验证逻辑，例如从数据库中查询用户信息
        // ...
        // 将AuthenticationToken转换为UsernamePasswordToken
        //从被shiro封装成的token中取出我们传入的username
        String username = (String) authenticationToken.getPrincipal();
        //这里应有一步去缓存或数据库查询的步骤，我省略了
        //我直接定义了一个username，如果用户名不匹配，则报错用户名不存在。
        if(!"Violet".equals(username)){
            throw new UnknownAccountException("账号不存在");
        }
        //返回一个新封装的认证实体，传入的是用户名，数据库查出来的密码，和当前Realm的名字
        return new SimpleAuthenticationInfo(username, "123456", this.getName());
    }


    @Override
    protected AuthorizationInfo doGetAuthorizationInfo(PrincipalCollection principalCollection) {
        return null;
    }
}
