build:
	docker build -t javalin-app .
run:
	docker run -p 7070:7070 javalin-app