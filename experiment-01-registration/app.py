from flask import Flask, render_template, request

app = Flask(__name__)

@app.get("/")
def home():
    return render_template("register.html")

@app.route("/register", methods=["GET", "POST"])
def register():
    if request.method == "POST":
        name = request.form.get("name", "").strip()
        email = request.form.get("email", "").strip()
        if not name or not email or "@" not in email:
            return "Please provide a valid name and email", 400
        # Lab demonstration: no passwords or personal data are stored.
        return render_template("success.html", name=name)
    return render_template("register.html")

if __name__ == "__main__":
    app.run(host="0.0.0.0", port=5000)
