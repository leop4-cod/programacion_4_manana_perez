$commits = git log profes_repo/PRIMER_CORTE..profes_repo/SEGUNDO_CORTE --format="%H %cI" --reverse

$skip = @(
"0a7e69dc14ed1e1dd8847381ca4fc68f254066a1",
"fd9efff6b5e4bbdc113373b563e248d66978e1b3",
"a0610ea85685b44c40595d1b44e21843c8a233f3"
)

$env:GIT_COMMITTER_NAME="leop4-cod"
$env:GIT_COMMITTER_EMAIL="leo0411201@gmail.com"

foreach ($line in $commits) {
    if (-not $line) { continue }
    $parts = $line -split " "
    $hash = $parts[0]
    $date = $parts[1]
    
    if ($skip -contains $hash) {
        Write-Host "Skipping $hash"
        continue
    }
    
    Write-Host "Cherry-picking $hash"
    git cherry-pick $hash --no-commit
    $env:GIT_COMMITTER_DATE=$date
    git commit --author="leop4-cod <leo0411201@gmail.com>" --date="$date" -C $hash
}
