### 文件说明
#### 这是spring boot + mybatis的脚手架
（实验说明）单纯的使用idea选取spring boot 和 mybatis模块是启动不了的  
还需要相关的配置文件

数据库的访问位置
在application.yml
spring  
-name 指的是在mysql创建完数据库之后再在里面创建的db数据库 
-username 用户名 mysql默认的是root
-password 。。。
其余的配置不动

在pom.xml里面还需要加入mybatis的逆向生成路径  

修改启动类

