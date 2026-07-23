# Lab 3 Profile App

This is a Java Android mobile application based on the Lab 3 PDF. It has two screens:

1. Main screen: photo, name, matric number, course and **View Details** button.
2. Detail screen: a second photo and the information received through an explicit Intent.

## Student information already inserted

- Name: Abraham Joy AL Selvarajoo
- Matric: 4241003072
- Course: IAS3153 Mobile Programming

## Replace the placeholder photos

Open this folder:

`app/src/main/res/drawable/`

Replace these two files with your own JPG or PNG pictures:

- `image1.png` - main screen photo
- `image2.png` - details screen photo

Important:

- Keep the exact lowercase filenames `image1.png` and `image2.png`.
- Do not use spaces, capital letters or hyphens in Android resource filenames.
- A square image works best.
- When Windows asks whether to replace the existing file, choose **Replace**.

You may use the same photo twice by copying it and naming the copies `image1.png` and `image2.png`.

## Build the APK on GitHub

1. Create a new empty GitHub repository.
2. Upload every file and folder from this project, including the hidden `.github` folder.
3. Commit the files to the `main` branch.
4. Open the repository's **Actions** tab.
5. Select **Build Lab 3 APK**.
6. Click **Run workflow**. A build also starts automatically after a push to `main`.
7. Open the completed green workflow run.
8. Under **Artifacts**, download `Lab3ProfileApp-APK`.
9. Extract the downloaded ZIP to obtain `app-debug.apk`.

GitHub builds the APK; it does not display the Android app like a phone emulator. Install the APK on an Android phone to run the app.

## Open in Android Studio

Open the `Lab3ProfileApp` folder as an existing project and allow Gradle sync to finish.
