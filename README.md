# ssm-project
springmvc + spring + mybatis +springboot  + maven 项目的搭建学习

注意几点事项：

   1、实体是自动生成的，先见表就可以反向生成实体、mapping等

   2、当出现存入数据库中文乱码时，先坚持整体项目的编码格式，目前选的是utf-8，
     当一切都设置好后，存入数据库仍然乱码时，坚持自己的数据库连接格式等，如使用mysql，修改my.ini
     初始化信息即可，在client添加   default-character-set=utf8  完mysql 修改default-character-set=utf8
     修改character-set-server=utf8 即可

   3、提交代码如何忽略不需要提交的东西，在工作空间加.gitignroe文件，具体内容可以根据自已要求添加：
     最基本的如

   4、当代码提交后，无法pull代码时，修改工作空间.git文件下的config文件即可，添加：
       [branch "master"] 
        remote = origin 
        merge = refs/heads/master 
    [remote "origin"] 
        url = https://github.com/zhangxinyu2/sub-modules-springboot.git  <--------git连接地址即可
        fetch = +refs/heads/*:refs/remotes/origin/*
    
 
