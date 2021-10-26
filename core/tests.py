from django.test import TestCase
from django.contrib.auth.models import AnonymousUser, User


# Create your tests here.
class URLTests(TestCase):
    def test_homepage(self):
        response = self.client.get('/')
        self.assertEqual(response.status_code, 200)

    def test_shopPage(self):
        response = self.client.get('/shop/')
        self.assertEqual(response.status_code, 200)

    def test_BootPage(self):
        response = self.client.get('/category/Boot')
        # page redirection
        self.assertEqual(response.status_code, 301)

    def test_HighHeelsPage(self):
        response = self.client.get('/category/heels')
        # page redirection
        self.assertEqual(response.status_code, 301)

    def test_LowHeelsPage(self):
        response = self.client.get('/category/lowheels')
        # page redirection
        self.assertEqual(response.status_code, 301)

    def test_SpikesPage(self):
        response = self.client.get('/category/Spikes')
        # page redirection
        self.assertEqual(response.status_code, 301)

    def test_FormalPage(self):
        response = self.client.get('/category/men')
        # page redirection
        self.assertEqual(response.status_code, 301)

    def test_LadiesPage(self):
        response = self.client.get('/category/ladies')
        # page redirection
        self.assertEqual(response.status_code, 301)

    def test_loginPage(self):
        response = self.client.get('/category/accounts')
        # page redirection
        self.assertEqual(response.status_code, 301)


class DataBaseTests(TestCase):
    def test_building(self):
        user = AnonymousUser()

        pass