# Course Information
* **Course:** CPAN 211
* **Topic:** Introduction to Data Structures (Lists, Sets, Maps, Queues)

## Getting Started
This is a starter template for your lab assignments. Follow the GitHub setup below before beginning your work.

### GitHub Setup
#### Step 1: Fork and Clone
1. Go to the [repository on GitHub](https://github.com/ChristinHumber/CPAN211_Lab8).
2. Click the **Fork** button in the top-right corner (**VERY IMPORTANT!!!!**).
3. This creates your own copy of the project.
4. Clone Your Fork:
   ```bash
   git clone https://github.com/YOUR-USERNAME/CPAN211_Lab8.git
   cd CPAN211_Lab8
   ```
5. Add Upstream Remote:
   ```bash
   git remote add upstream https://github.com/ChristinHumber/CPAN211_Lab8.git
   ```
6. Pull Latest Changes:
   ```bash
   git pull upstream main
   ```
7. Create a Feature Branch:
   ```bash
   git checkout -b feature/lab-yourname
   ```
   *Replace `yourname` with your actual name (e.g., `feature/lab1-john-doe` or `feature/lab-john-doe`).*

#### Step 2: Open a Pull Request
1. Go to the upstream repository at [ChristinHumber/CPAN211_Lab8](https://github.com/ChristinHumber/CPAN211_Lab8).
2. You should see a prompt banner saying "Compare & pull request" for your pushed branch. Click it.
3. If you don't see the banner:
   - Go to your GitHub fork page.
   - Switch to your feature branch using the branch dropdown menu.
   - Click **Contribute** and then select **Open pull request**.
4. Verify the base repository is `ChristinHumber/IntroToDataStructure_Lab` and the base branch is `main`.
5. Set the title of your pull request to: `Lab Submission - [Your Name]` (e.g., `Lab Submission - John Doe`).
6. Click **Create pull request** to complete the submission.

#### Additional Requirements
* **Code Verification:** Make sure all compilation errors are fixed and your code runs successfully before submitting.

---

# Lab: Postfix Expression Evaluator

## Description
Postfix notation is a way of writing expressions without using parentheses. For example, the expression `(1 + 2) * 3` would be written as `1 2 + 3 *`. 

A postfix expression is evaluated using a stack:
1. Scan a postfix expression from left to right.
2. A variable or constant (operand) is pushed into the stack.
3. When an operator is encountered, apply the operator with the top two operands in the stack and replace the two operands with the result.

Write a program to evaluate postfix expressions. Pass the expression as argument in one string.

## Visual Example: Evaluating `1 2 + 3 *`

The following table illustrates how the stack changes at each step of scanning the expression `1 2 + 3 *`:

### Step-by-Step Execution Table

| Step | Scanned Token | Stack Action | Stack State (Bottom &rarr; Top) | Description / Calculation |
| :---: | :---: | :---: | :---: | :--- |
| **1** | `1` | Push | `[1]` | Push operand `1` onto stack. |
| **2** | `2` | Push | `[1, 2]` | Push operand `2` onto stack. |
| **3** | `+` | Pop, Pop, Compute, Push | `[3]` | Pop `2` and `1`. Compute `1 + 2 = 3`. Push `3` back. |
| **4** | `3` | Push | `[3, 3]` | Push operand `3` onto stack. |
| **5** | `*` | Pop, Pop, Compute, Push | `[9]` | Pop `3` and `3`. Compute `3 * 3 = 9`. Push `9` back. |
