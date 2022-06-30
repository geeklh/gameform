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

接口访问测试  
使用postman 访问链接(get/post...)http://localhost:8080/user/test.do  


#### 构建工程项目步骤  
1. 选择spring web、jdbc、jdbc api、mysql、mybatis
2. 修改pom.xml
3. 在resource创建generator文件夹、然后在里面创建ggeneratorConfif.xml
4. 删除原来的application 创建application.yml 编辑内容
5. 添加maven启动类 ，对mybatis进行逆向编译
6. 编辑启动类 加上mappingscan("com.eexample.dao")
7. 添加usercontroller 加上test.do接口
8. 启动服务 使用postman测试接口 返回数据