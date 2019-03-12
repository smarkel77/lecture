<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Tom's Band's Page!</title>
	</head>
	<body>
	
		<c:if test="${thankYou}">
			<p>Thank you for your request!</p>
		</c:if>
		<a href="requestSong">Request A Song!</a>
		<h1>Here are all the songs we know:</h1>
		
		<table border=1>
			<tr>
				<th>Song</th>
				<th>Artist</th>
				<th>Album</th>
			</tr>
		
			<c:forEach var="song" items="${songs}">
				<tr>
					<td>${song.title}</td>
					<td>${song.artist}</td>
					<td>${song.album}</td>					
				</tr>
			</c:forEach>
		
		</table>
		
		<c:if test="${empty songs}">
			<h3>We'd better learn some songs...</h3>
		</c:if>
		
		<h1>Here are all the songs we have been asked to play:</h1>
		
		<table border=1>
			<tr>
				<th>Song</th>
				<th>Artist</th>
				<th>Album</th>
			</tr>
		
			<c:forEach var="song" items="${requests}">
				<tr>
					<td>${song.title}</td>
					<td>${song.artist}</td>
					<td>${song.album}</td>					
				</tr>
			</c:forEach>
		
		</table>
		
		<c:if test="${empty requests}">
			<h3>We'd better get some fans...</h3>
		</c:if>		
		
	</body>
</html>