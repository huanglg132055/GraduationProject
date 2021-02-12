<%@ page contentType="text/html;charset=UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>
<fmt:setLocale value="zh_cn" scope="page"/>
<fmt:setBundle basename="i18n.i18n" scope="page" var="bundle"/>
<c:set var="ctx" value="${pageContext.request.contextPath}"/>
<%response.setStatus(200);%>

<!DOCTYPE html>
<html>
<head>
	<title>404 - <fmt:message bundle='${pageScope.bundle}'  key='The.page.you.requested.does.not.exist' /></title>
</head>

<body style="background:#fff;">
	<div style="width:477px;height:469px; margin-left:auto;margin-right:auto;">
		<img  alt="" src="${ctx}/static/images/jianshezhong.png" />
	</div>

</body>
</html>