Contributing Guidelines
Thank you for considering contributing to this project! We appreciate your efforts to make it better.

To ensure a smooth and efficient collaboration, please review and adhere to the following guidelines.

Table of Contents
Code of Conduct
How Can I Contribute?
Bug Reports
Feature Requests
Pull Requests
Development Setup
Style Guide
Commit Guidelines
License
Code of Conduct
Please review and abide by our Code of Conduct which establishes a respectful and inclusive environment for everyone involved in the project.

How Can I Contribute?
Bug Reports
If you encounter a bug or an issue while using the project, please ensure it hasn't already been reported by searching through the Issues. If it's a new problem, feel free to open a new issue with detailed information such as:

Steps to reproduce the issue
Expected behavior
Actual behavior
Screenshots (if applicable)
Environment details (operating system, browser, etc.)
Feature Requests
We welcome suggestions for new features or improvements. Before submitting a feature request, please search the Issues to ensure it hasn't been addressed before. If it's a unique request, you can open a new issue and include:

A clear and descriptive title
A detailed description of the proposed feature
Any relevant use cases or examples
Pull Requests
We gladly accept contributions via pull requests. To submit a pull request, follow these steps:

Fork the repository and create your branch from the main branch.
Make your changes and ensure the codebase follows our style guide.
Write clear and concise commit messages following our commit guidelines.
Test your changes to ensure they work as intended.
Submit the pull request, providing a detailed description of the changes made.
We'll review your pull request as soon as possible and provide any feedback or suggestions.

Development Setup
To set up the project locally for development, follow these steps:

Clone the repository: git clone https://github.com/Zhu-Pengming-Tom/Intro.git
Install the required dependencies: npm install
Configure any necessary environment variables.
Run the project: npm start
Please refer to the project's documentation or README file for more specific instructions.

Style Guide
To maintain consistency throughout the codebase, please follow our style guide. It covers aspects such as code formatting, naming conventions, and best practices. Familiarize yourself with the style guide before contributing.

Commit Guidelines
We use Conventional Commits for our commit messages. Please ensure your commit messages follow this format as it helps with automated release notes and versioning.

License
By contributing to this project, you agree that your contributions will be licensed under the project's license. Make sure to read and understand the terms of the license before making any contributions.

Some git teaching

1. Open git.
2. Navigate to the destination folder to which you want to clone the repository.
3. Run the following command to clone the repository: git clone <repository_url>
  Where <repository_url> is the URL of the repository you want to clone. You can find the URL of the repository on the GitHub page.
  For example, if you want to clone a warehouse named Intro, you can use the following command:
                    git clone https://github.com/Zhu-Pengming-Tom/Intro.git 
4. After the clone is complete, go to the warehouse directory:
                    cd Intro
5. Run the following commands to perform rebase operations and add signature lines to each commit
                    git rebase -i HEAD~1(number of commits of signatures) --signoff
This will open an interactive rebase editor that displays the two most recent commits.
6. For each submission, change pick to edit, save and close the editor
  The way you save and close the editor may vary depending on your default editor. Here are some common ways for editors to save and close:
  Vim Editor: Press Esc, type :wq, and finally press Enter.
  Nano Editor: Press Ctrl and O (simultaneously), then Enter to save, and finally Ctrl and X (simultaneously) to exit the editor.
  Sublime Text Editor: Press the Ctrl key and the S key (at the same time) to save, then close the editor window.
7. For each commit, run the following command to add the signature line and modify the commit message (replace <Author Name> and <authoremail@example.com> with the actual author name and email address) :
                    git commit --amend -s --author="Author Name <authoremail@example.com>"
  You can repeat this step after each submission.
8. After the modification, run the following command to continue the rebase process:
                   git rebase --continue, how many commits, how many times.
9. Finally, force push changes to the remote repository:
                   git push --force-with-lease origin The name of your fork (TomABdh-patch-1)

