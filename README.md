33-springmvc

国际化资源
http://www.shouce.ren/api/spring2.5/ch13s06.html
curl  POST -d "name=1" http://localhost:8007/form/save --verbose -c cookie
curl  POST -d "name=1" http://localhost:8007/form/save --verbose -b cookie
at org.springframework.validation.beanvalidation.LocaleContextMessageInterpolator.interpolate(LocaleContextMessageInterpolator.java:50)
at org.hibernate.validator.internal.engine.ValidationContext.interpolate(ValidationContext.java:362)
at org.hibernate.validator.internal.engine.ValidationContext.createConstraintViolation(ValidationContext.java:271)
at org.hibernate.validator.internal.engine.ValidationContext.createConstraintViolations(ValidationContext.java:232)
at org.hibernate.validator.internal.engine.constraintvalidation.ConstraintTree.validateSingleConstraint(ConstraintTree.java:291)
at org.hibernate.validator.internal.engine.constraintvalidation.ConstraintTree.validateConstraints(ConstraintTree.java:133)
at org.hibernate.validator.internal.engine.constraintvalidation.ConstraintTree.validateConstraints(ConstraintTree.java:91)
at org.hibernate.validator.internal.metadata.core.MetaConstraint.validateConstraint(MetaConstraint.java:84)
at org.hibernate.validator.internal.engine.ValidatorImpl.validateConstraint(ValidatorImpl.java:525)
at org.hibernate.validator.internal.engine.ValidatorImpl.validateConstraintsForDefaultGroup(ValidatorImpl.java:465)
at org.hibernate.validator.internal.engine.ValidatorImpl.validateConstraintsForCurrentGroup(ValidatorImpl.java:429)
at org.hibernate.validator.internal.engine.ValidatorImpl.validateInContext(ValidatorImpl.java:381)
at org.hibernate.validator.internal.engine.ValidatorImpl.validate(ValidatorImpl.java:184)
at org.springframework.validation.beanvalidation.SpringValidatorAdapter.validate(SpringValidatorAdapter.java:92)
at org.springframework.validation.DataBinder.validate(DataBinder.java:845)
at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.validateIfApplicable(ModelAttributeMethodProcessor.java:164)
at org.springframework.web.method.annotation.ModelAttributeMethodProcessor.resolveArgument(ModelAttributeMethodProcessor.java:111)
at org.springframework.web.method.support.HandlerMethodArgumentResolverComposite.resolveArgument(HandlerMethodArgumentResolverComposite.java:78)
at org.springframework.web.method.support.InvocableHandlerMethod.getMethodArgumentValues(InvocableHandlerMethod.java:162)
at org.springframework.web.method.support.InvocableHandlerMethod.invokeForRequest(InvocableHandlerMethod.java:129)
at org.springframework.web.servlet.mvc.method.annotation.ServletInvocableHandlerMethod.invokeAndHandle(ServletInvocableHandlerMethod.java:111)
at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.invokeHandlerMethod(RequestMappingHandlerAdapter.java:806)
at org.springframework.web.servlet.mvc.method.annotation.RequestMappingHandlerAdapter.handleInternal(RequestMappingHandlerAdapter.java:729)
at org.springframework.web.servlet.mvc.method.AbstractHandlerMethodAdapter.handle(AbstractHandlerMethodAdapter.java:85)
at org.springframework.web.servlet.DispatcherServlet.doDispatch(DispatcherServlet.java:959)
at org.springframework.web.servlet.DispatcherServlet.doService(DispatcherServlet.java:893)
at org.springframework.web.servlet.FrameworkServlet.processRequest(FrameworkServlet.java:970)
at org.springframework.web.servlet.FrameworkServlet.doPost(FrameworkServlet.java:872)
at javax.servlet.http.HttpServlet.service(HttpServlet.java:650)
at org.springframework.web.servlet.FrameworkServlet.service(FrameworkServlet.java:846)
at javax.servlet.http.HttpServlet.service(HttpServlet.java:731)



1.pom.xml中增
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger2</artifactId>
			<version>2.2.2</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml.jackson.core</groupId>
			<artifactId>jackson-databind</artifactId>
			<version>2.5.0</version>
		</dependency>
		<dependency>
			<groupId>io.springfox</groupId>
			<artifactId>springfox-swagger-ui</artifactId>
			<version>2.2.2</version>
		</dependency>
		<dependency>
			<groupId>com.fasterxml</groupId>
			<artifactId>classmate</artifactId>
			<version>1.3.1</version>
		</dependency>
2.实例化bean
<bean class="springfox.documentation.swagger2.configuration.Swagger2DocumentationConfiguration" id="swagger2Config"/>

//@Api(value="Hello World", description="Hello World Controller")

3.http://localhost:8007/swagger-ui.html
http://localhost:8007/v2/api-docs