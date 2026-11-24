# Username and Age Validation

## Overview

In this exercise, you will write a program that validates a username and an age before accepting the information.

**Important:** Do not assume that a value is valid simply because the user entered it. Your program must check each value against the validation rules before accepting it.

## Requirements

### 1. Username Validation

The username must meet all of the following rules:

- The username must contain between **5 and 20 characters**, inclusive.
- An empty username must be rejected.
- A username containing only spaces must be rejected.
- A username with fewer than 5 characters must be rejected.
- A username with more than 20 characters must be rejected.

A username is valid only when it satisfies every rule.

### 2. Age Validation

- The age must be a whole number from **16 through 100**, inclusive.
- Ages below 16 must be rejected.
- Ages above 100 must be rejected.
- Input that is not a valid whole number must be rejected.

### 3. Validate Before Accepting Input

Your program must explicitly validate the username and age. Do not treat the input as valid merely because the user entered a value.

If an input is invalid, display an appropriate error message. The program should not accept the invalid value as valid.

## Test Your Program

Test your program with at least the following cases. You may add more tests to check boundary conditions and other invalid input.

| Test | Username | Age | Expected result |
|---|---|---:|---|
| 1. Valid input | `Jordan23` | `21` | Accept both values |
| 2. Too short | `Sam` | `21` | Reject the username |
| 3. Too long | `ThisUsernameIsWayTooLong` | `21` | Reject the username |
| 4. Invalid age (too young) | `Taylor5` | `15` | Reject the age |
| 5. Invalid age (too old) | `Taylor5` | `101` | Reject the age |
| 6. Empty username | *(empty)* | `21` | Reject the username |
| 7. Spaces-only username | `     ` | `21` | Reject the username |
| 8. Invalid age format | `Taylor5` | `sixteen` | Reject the age |

### Boundary Tests

Also verify that the inclusive limits are handled correctly:

| Username | Age | Expected result |
|---|---:|---|
| `Abcde` | `16` | Accept both values |
| `Username12345678901` | `100` | Accept both values |

## Submission Expectations

Your completed program should:

- Apply every username validation rule.
- Apply the age range validation rule.
- Reject empty and spaces-only usernames.
- Reject invalid numeric input for age.
- Display useful validation messages.
- Test the program with at least four inputs, including valid input, a username that is too short, a username that is too long, and an invalid age.

## Final Checklist

- [ ] Username length is checked (5–20 characters).
- [ ] Empty usernames are rejected.
- [ ] Usernames containing only spaces are rejected.
- [ ] Ages from 16 through 100 are accepted.
- [ ] Ages below 16 and above 100 are rejected.
- [ ] Non-integer age input is rejected.
- [ ] At least four test cases have been run.
- [ ] Invalid input is not accepted as valid.
