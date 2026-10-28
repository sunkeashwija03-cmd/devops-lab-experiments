from flask import Flask, request, render_template_string

app = Flask(__name__)

PAGE = '''
<!doctype html>
<title>My Containerized Application</title>
<h2>Simple Form</h2>
<form method="post">
  <input name="name" placeholder="Name" required>
  <input name="email" type="email" placeholder="Email" required>
  <button name="submit" type="submit">Submit</button>
</form>
<div id="result">{{ result }}</div>
'''

@app.route("/", methods=["GET", "POST"])
def home():
    result = ""
    if request.method == "POST":
        result = "Form submitted successfully!"
    return render_template_string(PAGE, result=result)

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=8080)
