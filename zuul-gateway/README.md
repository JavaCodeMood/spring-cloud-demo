####  使用Ribbon和SpringCloud实现客户端负载均衡-Zuul网关服务 

1. Zuul是服务器端的负载均衡组件，能够对请求进行路由和过滤处理，主要对请求进行转发，根据相应的规则引擎转发给后端的相应服务。    

2. Spring cloud Zuul会自动设置路径到applicaiton name上。    
Zuul使用Ribbon来执行客户端负载均衡，并且默认Ribbon使用Eureka发现服务。这里我们跳过服务发现，因此设 置ribbon.eureka.enabled为false。
因此，Ribbon现在不使用Eureka发现服务，必须手动指定一个BookService 的url。    

3. 创建ZuulFilter      
过滤器是过滤请求的。zuul过滤器有四中过滤类型：     
pre 路由请求前执行。    
route 处理实际的路由请求。     
post 在请求路由完成后执行。    
error 处理请求期间出现错误执行。    
