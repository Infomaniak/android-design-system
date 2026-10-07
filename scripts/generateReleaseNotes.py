import json


with open("package-versions.json") as file:
    versions = json.load(file)

lines = [f"`{package}`: {version}" for package, version in versions.items() if version]
if lines:
    print("### Versions\n\n" + "\n\n".join(lines))
