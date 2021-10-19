FROM python:3.8

# copy files
COPY requirements.txt .

# chaneg the working director

# set environment variables
ENV PYTHONDONTWRITEBYTECODE 1
ENV PYTHONUNBUFFERED 1

RUN pip install --upgrade pip 

# run the requirments
RUN pip install --upgrade pip

RUN pip install psycopg2

RUN pip install --no-cache-dir -r requirements.txt

# run the application
# remove - psycopg2>=2.8.3


RUN pip install django
RUN pip install django-allauth
RUN pip install django-crispy-forms
RUN pip install django_countries
RUN pip install stripe
RUN python -m pip install Pillow
RUN pip install flake8

# copy files
#COPY . /app

# chaneg the working director
WORKDIR /app

EXPOSE 8000

CMD [ "python","manage.py", "core"]

CMD [ "python","manage.py", "test" ]

CMD [ "python","manage.py", "runserver","0.0.0.0:8000" ]

#RUN pip install -r requiments.txt 

# docker run --name software_project -d -p 8000:8000 software_project:latest
#  docker build --tag software_project:latest .
# container list
# docker container ps

# docker image list
# docker image ls

# remove container
# docker rm --force software_project