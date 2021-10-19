![](https://img.shields.io/badge/-HTML-e34f26?logo=html5&logoColor=fff)


![Top languages](https://github-readme-stats.vercel.app/api/top-langs/?username=PRAVEENDHANANJAYA&show_icons=true&theme=radical)


# Installation

`pip install django`

`virtualenv env`

# For Window

`env\scripts\activate`

`pip install -r requirements.txt`

`python manage.py makemigrations`

`python manage.py migrate`

`python manage.py runserver`


# Docker

Build docker image

* `docker build --tag django_todo:latest .`

run the image

* `docker run --name django_todo -d -p 8000:8000 django_todo:latest`

container list

* `docker container ps`

docker image list

* `docker image ls`

remove container

* `docker rm --force django_todo`

# For Admin Login

```python
python manage.py createsuperuser
Username : admin
Password : 12345678
```


![Github stats](https://github-readme-stats.vercel.app/api?username=praveendhananjaya&count_private=true&show_icons=true&theme=radical)
