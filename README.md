# ApplitoolsEyes

## This repo contains a small demo of the Applitools Eyes tool in action.

Introduction:
Applitools Eyes detects any differences between two screen displays and can replace hundreds of lines of testing code with one smart visual scan. Applitools Eyes can test web applications on multiple browsers, including Chrome, Safari, Internet Explorer, etc., and it can test in as many screen resolutions as you want. It can also test a mobile application on an iPhone, iPad, or iPad mini in both portrait and landscape orientations.

How does Applitool work?
Applitools easily integrates with your existing tests – no need to create new tests or learn new frameworks. With a single snippet of code, Applitools Eyes captures and analyzes an entire screen of your application.

# To get going
1.  Create a free account on Applitools website
2.  Confirm your email address
3.  Log into applitools eyes
4.  Get your API Key
5.  In SeleniumTest class, update the API key with yours:
    ```
    eyes.setApiKey("<YourApiKey>");
    ```
6. Run the test
7. Once the test has completed, Navigate to Applitools Eyes dashboard and view the results

e.g.

![image](https://user-images.githubusercontent.com/98324823/166414701-db012512-829d-47ea-bfd1-2ecd73220683.png)


**Bare in mind that screenshots from the first run will form your Baseline, Therefore any subsequent runs will be verified against the baseline images as explained below.**

### Baseline vs. Checkpoint images
When you first run the test, our AI engine stores those first set of screenshots as Baseline images. When you run the same test again (and everytime there after), the AI server compares the new set of screenshots, aka Checkpoint images, with the corresponding Baseline images and highlights differences in a pink color.

![image](https://user-images.githubusercontent.com/98324823/166415312-371ea24d-942a-4486-860a-66f9d03ac688.png)
