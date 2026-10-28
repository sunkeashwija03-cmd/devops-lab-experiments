from flask import Flask, request, render_template_string

app = Flask(__name__)

FORM = '''
<h2>Event Registration</h2>
<form method="post">
  <input name="name" placeholder="Name" required><br><br>
  <input type="email" name="email" placeholder="Email" required><br><br>
  <input type="password" name="password" placeholder="Password" required><br><br>
  <button type="submit">Register</button>
</form>
'''

@app.route("/register", methods=["GET", "POST"])
def register():
    if request.method == "POST":
        name = request.form.get("name", "")
        return f"<h2>Registration Successful</h2><p>Thank you, {name}!</p>"
    return render_template_string(FORM)

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
