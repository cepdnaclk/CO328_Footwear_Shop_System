from django.test import TestCase

# Create your tests here.
class URLTests(TestCase):
    def test_testhomepage(self):
        reponse = self.client.get('/')
        self.assertEqual(reponse.status_code,200)

    def test_fail(self):
        self.assertEqual(0,-1)