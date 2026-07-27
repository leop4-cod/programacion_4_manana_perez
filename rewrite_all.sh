git filter-branch -f --env-filter '
export GIT_AUTHOR_NAME="leop4-cod"
export GIT_AUTHOR_EMAIL="leo0411201@gmail.com"
export GIT_COMMITTER_NAME="leop4-cod"
export GIT_COMMITTER_EMAIL="leo0411201@gmail.com"
' HEAD
