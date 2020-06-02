# 项目初衷  
自我学习提升,尝试拆分项目，提高一下项目规划的能力，独立模块会采用不同的技术栈，提升平常项目中不会采用，需要学习的内容！

# 项目内容划分  

### 第一阶段  
1.搭建原始雏形  

 技术栈      | 版本号     | 备注     |  
 ---------- | :-----------:  | :-----------: |  
jdk     |   11   | 可以升级更高的版本自我扩展 |  
springboot     |   2.3.0.RELEASE   | 可以升级更高的版本自我扩展 |  
dubbo     |   2.7.6   | 可以升级更高的版本自我扩展 |  
jwt     |   3.8.0   | 可以升级更高的版本自我扩展 |  
zookeeper     |   3.6.1   | 可以升级更高的版本自我扩展 |  
cloud     |   Hoxton.SR4  | 可以升级更高的版本自我扩展 |  
eureka     |   2.2.2  | 可以升级更高的版本自我扩展 |  
openfeign     |   2.2.2  | 可以升级更高的版本自我扩展 | 
hystrix     |   2.2.2  | 可以升级更高的版本自我扩展 |

* 备注
《可以升级更高的版本自我扩展》不能保证项目可以启动需要，需要自己适配版本》


### 第二阶段
1.模块划分

  模块名称      | 版本号     | 备注     |  
---------- | :-----------:  | :-----------: |  
 medusa-auth     |   1.0-SNAPSHOT   | 用户中心(包含权限校验) |  
 medusa-gateway     |   1.0-SNAPSHOT   | 网关层 |  
 medusa-eureka-server     |   1.0-SNAPSHOT   | eureka注册中心 |  
 common-util     |   0.0.1-common   | 共公的工具类 |  
 medusa-order     |   1.0-SNAPSHOT   | 订单服务 |
 
 
### 第三阶段
1.服务的负载均衡 监控(TODO)
 
# 项目备注

* auth模块

1.占用的端口号 server-8091 web-8090

2.使用dubbo zk

* gateway模块

1.占用的端口号 8080

2.spring cloud gateway eureka

* eureka server模块

1.占用的端口号 8070

* order模块

1.占用的端口号 server-8060 web-8061

2.使用cloud openfeign eureka










 