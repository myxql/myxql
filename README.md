# myxql

#### 介绍
大数据血缘解析，支持包括spark/hive/postgreSQL/mysql等常见大数据引擎，实现从SQL语句中解析表血缘关系和字段血缘解关系。同时支持从SQL作业中分解参数及提取每条SQL的血缘数据。
#### 软件架构
软件架构说明
     |--------------------------------------------------------------|
     |SparkSQL  |  HiveSQL |  MySQL    |   PostgreSQL  |      ...   |
     |----------------Antlr4----------------------------------------|
     |   语法树解析（逻辑计划）、SQL格式化、SQL改写                     |
     |--------------------------------------------------------------|
     |   血缘模型：                                                  |
     |   1）作业输入输出                                             |
     |   2）表、分区、属性、表上下游关系                               |
     |   3）字段上下游关系                                            |
     |--------------------------------------------------------------|
        
#### 路线图
1.  SparkSQL表及字段血缘解析，已完成
2.  作业参数及作业输入输出表解析，已完成
3.  HiveSQL表及字段血缘解析，开发中
4.  Mysql表及字段血缘解析，计划中
5.  PostgreSQL表及字段血缘解析，计划中
6.  暂不支持链接metastore，因此*语法暂不支持

#### 使用说明

1.  xxxx
2.  xxxx
3.  xxxx

#### 参与贡献

1.  Fork 本仓库
2.  新建 Feat_xxx 分支
3.  提交代码
4.  新建 Pull Request


#### 特技

1.  使用 Readme\_XXX.md 来支持不同的语言，例如 Readme\_en.md, Readme\_zh.md
2.  Gitee 官方博客 [blog.gitee.com](https://blog.gitee.com)
3.  你可以 [https://gitee.com/explore](https://gitee.com/explore) 这个地址来了解 Gitee 上的优秀开源项目
4.  [GVP](https://gitee.com/gvp) 全称是 Gitee 最有价值开源项目，是综合评定出的优秀开源项目
5.  Gitee 官方提供的使用手册 [https://gitee.com/help](https://gitee.com/help)
6.  Gitee 封面人物是一档用来展示 Gitee 会员风采的栏目 [https://gitee.com/gitee-stars/](https://gitee.com/gitee-stars/)
