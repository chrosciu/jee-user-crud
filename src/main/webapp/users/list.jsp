<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ include file="/header.jsp" %>

<!-- Begin Page Content -->
<div class="container-fluid">

  <!-- Page Heading -->
  <div class="d-sm-flex align-items-center justify-content-between mb-4">
    <h1 class="h3 mb-0 text-gray-800">Dashboard</h1>
    <a href="#" class="d-none d-sm-inline-block btn btn-sm btn-primary shadow-sm"><i class="fas fa-download fa-sm text-white-50"></i> Generate Report</a>
  </div>

  <table class="table table-bordered">
  <c:forEach items="${users}" var="user">
    <tr>
      <td>
          ${user.id}
      </td>
      <td>
          ${user.userName}
      </td>
      <td>
          ${user.email}
      </td>
    </tr>
  </c:forEach>
  </table>

</div>
<!-- /.container-fluid -->

<%@ include file="/footer.jsp" %>

