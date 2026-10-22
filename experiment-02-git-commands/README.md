# Experiment 2 — Git and GitHub commands
**Aim:** Explore version control commands. In a scratch directory (not your existing lab repo):

```bash
mkdir git-practice
cd git-practice
git init
git branch -M main
echo Hello > notes.txt
git status
git add notes.txt
git commit -m "Add notes"
git log --oneline
git switch -c feature/update
echo New >> notes.txt
git add .
git commit -m "Update notes"
git switch main
git merge feature/update
git status
```
To connect to GitHub: `git remote add origin https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git` and `git push -u origin main`.
To clone: `git clone https://github.com/YOUR_USERNAME/YOUR_REPOSITORY.git`.
**Evidence:** `git status`, `git log --oneline`, branch and merge output, remote GitHub commits. Do not blindly push the scratch repo to the lab repo URL.
