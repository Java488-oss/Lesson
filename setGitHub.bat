@echo on
git init
git config --global user.name "Java488-oss"
git config --global user.email "job.mail1358@gmail.com"
git add .
set /p "id=Input commit: "
git commit -m "%id%"
git remote set-url origin https://Java488-oss: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@github.com/Java488-oss/Lesson.git
git push origin master
pause