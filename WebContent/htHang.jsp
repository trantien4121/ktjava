<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page import="java.util.ArrayList"%>
<%@page import="bean.Hangbean"%>

<%@ page language="java" contentType="text/html; charset=utf-8"
	pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
<!-- Bootstrap CSS -->
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css"
	integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T"
	crossorigin="anonymous">
<!-- Optional JavaScript -->
<!-- jQuery first, then Popper.js, then Bootstrap JS -->
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js"
	integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
	crossorigin="anonymous"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js"
	integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
	crossorigin="anonymous"></script>
<script
	src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js"
	integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM"
	crossorigin="anonymous"></script>


<title>Hiển thị Hàng</title>
</head>
<body>
	<main class="container">
		<div class="row">
			<div class="offset-1 col-10">
				<form action="hthangservlet" method="post">
					<div class="card mt-5">
						<div class="card-header d-flex justify-content-center">
							<b>Hiển thị hàng hóa trong xuất kho trong năm 2022</b>
						</div>
						<div class="card-body">

							<div
								class="card-body__header-search d-flex justify-content-space-between">
								<span class="mr-5"></span> <input class="form-control mr-sm-2"
									name="txttk" value="${key }" type="text"
									placeholder="Nhập tên hàng..." aria-label="Search"
									style="width: 40%;"> <input
									class="form-control mr-sm-2" name="txttkgia" value="${gia}"
									type="text" placeholder="Nhập giá hàng..." aria-label="Search"
									style="width: 40%;">
								<button class="btn btn-success my-2 my-sm-0"
									type="submit">
									<i class="fa fa-search" aria-hidden="true"></i>
								</button>
							</div>
							<c:choose>
								<c:when test="${dsHang.size()==0}">
									<div
										class="card-body__header-count-item d-flex justify-content-begin mt-4">
										<span class="mr-5"> <b>Không tìm thấy hàng nào</b>
										</span>
									</div>
								</c:when>
								<c:otherwise>
									<div
										class="card-body__header-count-item d-flex justify-content-begin mt-4">
										<span class="mr-5"> <b>Số Items:
												${dsHang.size()}</b>
										</span>
									</div>

									<div
										class="card-body__content d-flex justify-content-center mt-3">
										<table class="table-hover mt-2 table-bordered"
											style="width: 1000px">
											<thead">
												<tr class="table-info">
													<th class="pl-1">Mã hàng</th>
													<th class="pl-1">Hình ảnh</th>
													<th class="pl-1">Tên hàng</th>
													<th class="pl-1">Nhà cung cấp</th>
													<th class="pl-1">Giá</th>
													<th class="pl-1">Số lượng</th>
													<th class="pl-1">Thành tiền</th>
													<th class="pl-1">Mức giá</th>
												</tr>
											</thead>
											<tbody style="font-weight: 600">
												<c:forEach var="h" items="${dsHang}">
													<tr class="table-secondary">
														<td class="pl-1">${h.getMahang()}</td>
														<td><img src="${h.getAnh()}" width="80px"
															height="80px" class="pl-2 pt-2 pb-2" /></td>
														<td class="pl-1">${h.getTenhang()}</td>
														<td class="pl-1">${h.getNhacungcap()}</td>
														<td class="pl-1">${h.getGia()}</td>
														<td class="pl-1">${h.getSoluong()}</td>
														<td class="pl-1">${h.getSoluong()*h.getGia()}</td>
														<td class="pl-1">${h.getSoluong()*h.getGia()>1000000?"Giá cao":"Giá trung bình"}</td>
													</tr>
												</c:forEach>
											</tbody>
										</table>
									</div>
								</c:otherwise>
							</c:choose>


						</div>
					</div>
				</form>
			</div>
		</div>
	</main>
</body>
</html>
