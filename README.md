# 工程简介
## 一、基本登录、注册功能
####  1-1、注册功能（三次请求）
访问注册页面
    · 点击顶部区域内的连接，打开注册页面：修改index和register页面  
提交注册数据
    · 通过表单提交数据
    · 服务端验证账号是否已存在、邮箱是否已注册
    · 服务端发送激活邮件    
激活邮箱账号
    · 点击邮箱中的链接，访问服务端的激活服务

#### 1-2、验证码功能实现
Kaptcha包
    · 创建配置类，配置验证码的字符、图片信息

#### 1-3、登录、退出功能
访问登录页面
    · 点击顶部区域内的连接，打开登录页面
登录
    · 验证账号、密码、验证码
    · 成功时，生成登录凭证，发给客户端
    · 失败时，跳转回登录页
退出
    · 将登录凭证修改为失效状态
    · 跳转至网站首页

#### 1-4、显示登录信息
拦截器示例
    · 定义拦截器，实现HandlerInterceptor
    · 配置拦截器，为它指定拦截、排除的路径
拦截器应用
    · 在请求开始时查询登录用户
    · 在本次请求中持有用户数据
    · 在模板视图上显示用户数据
    · 在请求结束时清理用户数据


#### 1-5、账号设置
上传文件
    · 请求：必须是POST请求
    · 表单：enctype="multipart/form-data"
    · Spring MVC：通过MultipartFile处理上传文件
开发步骤
    · 访问账号设置页面
    · 上传头像
    · 获取头像
    
#### 2-1、过滤敏感词
前缀树
    · Tire、字典树、
    · 应用：字符串检索、词频统计、字符串排序
敏感词过滤器
    · 定义前缀树
    · 根据敏感词，初始化前缀树
    · 编写敏感词的方法

#### 2-2、发布帖子（AJAX)
通过AJAX实现异步请求
    · 使用AJAX，网页能够将增量更新呈现到页面上，而不需要刷新整个页面
    · 使用AJAX请求，实现发布帖子的功能
添加帖子详情

#### 2-3、显示评论
数据层
    · 根据实体查询一页评论数据
    · 根据实体查询评论数量
业务层
    · 处理查询评论的业务
    · 处理查询评论数量的业务
表示层
    · 显示帖子详情数据
    · 显示帖子所有评论数据
    
#### 2-4、添加评论
数据层
    · 添加评论数据
    · 修改帖子评论数量
业务层
    · 处理添加评论业务
    · 先添加评论、再更新帖子评论数量
表示层
    · 处理添加评论数量请求
    · 设置添加评论表单
    
#### 2-5、私信列表
私信列表
    · 查询当前用户的会话列表，每个会话只显示一条最新的私信
    · 支持分页显示
私信详情
    · 查询某个会话所包含的私信
    · 支持分页显示

#### 2-6、发送私信
发送私信
    · 采用异步的方式发送私信
    · 发送成功后刷新私信列表
设置已读
    · 访问私信详情时，将显示的私信设置为已读状态
     
    
    
# 延伸阅读

