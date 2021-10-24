from django.test import TestCase


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
        response = self.client.get('/category/lowheels/')
        # page redirection
        print(response.status_code)
        self.assertEqual(response.status_code, 301)



