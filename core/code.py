class django_User():
    def __init__(self):
        self.status_code = 200
        self.login = False

    def response(self):
        return self.status_code

    def add_cart(self, product):
        if self.login:
            return 200
        else:
            return 301


class Tem_Product():
    def __init__(self, name, price):
        self.name = name
        self.price = price

    def product(self):
        return 301
