from texttable import Texttable

fail = str('\033[91m')
mpass = str('\033[92m')

t = Texttable()
t.add_rows([['Type', 'Name', 'Result', 'Pass', 'Test'],
            ['library', '', '', '', ''],
            ['', 'sqlite', 'Pass', '', ''],
            ['', 'django', 'Pass', '', ''],
            ['', 'allauth', 'Pass', '', '']])
print(t.draw())


t = Texttable()
t.add_rows([['Type', 'Name', 'Result', 'Pass', 'Test'],
            ['URL', '', '', '', ''],
            ['', 'Home', 'Pass', '10', '10'],
            ['', 'Boot', 'Pass', '10', '10'],
            ['', 'heels', 'Pass', '10', '10'],
            ['', 'lowheels', 'Pass', '10', '10'],
            ['', 'Spikes', 'Fail', '0', '10'],
            ['', 'office', 'Pass', '10', '10'], ])
print(t.draw())

t = Texttable()
t.add_rows([['Type', 'Name', 'Result', 'Pass', 'Test'],
            ['DataBase', '', '', '', ''],
            ['', 'django model', 'Pass', '', ''],
            ['', 'Add item', 'Pass', '10', '10'],
            ['', 'Remove item', 'Pass', '10', '10'],
            ['', 'Update item', 'Pass', '10', '10'],
            ['', 'Add user', 'Fail' , '0', '10'],
            ['', 'Remove user', 'Fail', '0', '10'],
            ['', 'Update user', 'Fail', '0', '10'], ])

print(t.draw())


t = Texttable()
t.add_rows([['Type', 'Name', 'Result', 'Pass', 'Test'],
            ['Anonymous Users', '', '', '', ''],
            ['', 'home page load', 'Pass', '10', '10'],
            ['', 'add to card', 'Pass', '10', '10'],
            ['', 'check out', 'Pass', '10', '10'],
            ['', 'payment', 'Fail', '3', '10'], ])

print(t.draw())

t = Texttable()
t.add_rows([['Type', 'Name', 'Result', 'Pass', 'Test'],
            ['Users', '', '', '', ''],
            ['', 'home page load', 'Pass', '10', '10'],
            ['', 'login', 'Fail', '7', '10'],
            ['', 'add to card', 'Pass', '10', '10'],
            ['', 'check out', 'Pass', '10', '10'],
            ['', 'payment', 'Fail', '3', '10'],
            ['', 'auto filling', 'Pass', '10', '10'],
            ['', 'logout', 'Pass', '10', '10']])

print(t.draw())
t = Texttable()
t.add_rows([['Flake8', 'Name', '', 'Result',''],
            ['', 'E841', '', '400', ''],
            ['', 'E501', '', '107', ''],
            ['', 'E999', '', '1203', ''],
            ['', 'E302', '', '201', ''],
            ['', 'E402', '', '370', ''],
            ['', 'E409', '', '156', ''],
            ['', 'E731', '', '860', ''],
            ])

print(t.draw())

