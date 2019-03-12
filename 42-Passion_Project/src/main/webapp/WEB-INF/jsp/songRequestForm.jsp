<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
	<head>
		<title>Song Request Form</title>
	</head>
	<body>
	
		<h1>Which song would you like to hear butchered at the hands of amateurs?</h1>
		
		<form action="requestSong" method="POST">
			<label for="title">Title: </label>
			<input type="text" name="title" id="title_input_box"/>
		
			<label for="artist">Artist: </label>
			<input type="text" name="artist" id="artist_input_box"/>

			<label for="album">Album: </label>
			<input type="text" name="album" id="album_input_box"/>
		
			<input type="submit"/>
		</form>

	</body>
</html>