import mysql
from flask import Flask, render_template, request
from flask_mysqldb import MySQL

app = Flask(__name__)

app.config['MYSQL_HOST'] = 'localhost'
app.config['MYSQL_USER'] = 'root'
app.config['MYSQL_PASSWORD'] = 'root'
app.config['MYSQL_DB'] = 'sakila'

mysql = MySQL(app)


@app.route('/', methods=['GET', 'POST'])
def index():
    if request.method == "POST":
        details = request.form
        l = details['a']
        m = details['b']
        n = details['c']
        o = details['d']
        cur = mysql.connection.cursor()
        cur.execute("INSERT INTO Project(Name,UID,Company_Name,Email_ID) VALUES (%s, %s, %s, %s)",
                    (l, m, n, o))
        mysql.connection.commit()
        cur.close()
        return render_template('home.html', w=l, x=m, y=n, z=o)
    return render_template('login.html')
@app.route('/home')
def page2():
    return render_template('home.html')


if __name__ == '__main__':
    app.run()