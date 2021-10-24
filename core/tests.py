from django.test import TestCase


# Create your tests here.
class URLTests(TestCase):
    def test_homepage(self):
        response = self.client.get('/')
        self.assertEqual(response.status_code, 200)

    def test_shopPage(self):
        response = self.client.get('/shop/')
        self.assertEqual(response.status_code, 200)
