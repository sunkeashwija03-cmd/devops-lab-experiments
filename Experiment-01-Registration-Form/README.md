# Experiment 1: Event Registration Form
Run locally: `python -m pip install -r requirements.txt` then `python app.py`
Open `http://localhost:5000/register`.

Build and run with Docker:
```bash
docker build -t event-registration .
docker run --rm -p 5000:5000 event-registration
```
Educational demo only: this sample does not store data and should not be used for real passwords.
