# Experiment 1 — Event registration form
**Aim:** Create a user registration form with Flask and Docker.

Run locally: `python -m pip install -r requirements.txt` then `python app.py`.
Or run with Docker: `docker build -t devops-registration .` then `docker run --rm -p 5000:5000 devops-registration`.
Open <http://localhost:5000/register>, submit name/email, and show the confirmation page.
The manual shows a password field; this educational demo intentionally does not collect or store passwords.
**Evidence to capture:** form page, successful submission, Docker terminal output.
