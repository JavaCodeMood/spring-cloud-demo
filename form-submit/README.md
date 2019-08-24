###  SpringCloud做表单提交   
1. RequestMapping映射GET,POST等多种方式的请求。GetMapping专门指GET方式，PostMapping专门指POST 方式。

2. th:action="@{/greeting}" 将表单提交给/greeting地址。      
   th:object="${greeting}" 定义收集表单数据的模型对象。     
   th:field="{id}" 对应上面Greeting对象的id字段。     
   th:field="{content}" 对应上面Greeting对象的content字段。    
   
3. @SpringBootApplication注解包含了很多注解：     
   @Configuration 标记该类是App上下文的Bean定义源。        
   @EnableAutoConfiguration 告诉SpringBoot开始添加classpath下的各种bean以及属性设置。      
   @EnableWebMvc Springboot如果看到在classpath下有spring-webmvc类库时，会自动添加该注解，表明启用webmvc注解 操作，并激活关键行为，比如设置DispatcherServlet。      
   @ComponentScan 告知Spring去搜索在该包下的其他组件、配置和服务，允许找出Controller。      

