# Unit 4 - Abstract Art Project

## Introduction

Data visualizations are powerful tools to present information and convey patterns and relationships. Sometimes visualizations are charts or graphs, and other times they are more abstract pieces of art. Your goal is to create a visual representation relating at least two categories from your dataset that engages your viewer and encourages them to learn more about your chosen topic.

## Requirements

Use your knowledge of object-oriented programming, one-dimensional (1D) arrays, and algorithms to create your data visualization program:

- **Create at least two 1D arrays** – Create at least two 1D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use methods in the Math class** – Use one or more methods in the Math class in your program, such as to perform calculations on the values in your dataset and display the results, choose random values from the dataset, or display images or shapes at random locations.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
  Note: This may be abstract! Others do not necessarily need to know what the story or pattern is right away, but you do need to be able to explain it to them.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## Dataset

Include a hyperlink to the source of your dataset used for this project. Additionally, provide a short description of each column used from the dataset, and the data type.

Example:

Dataset: https://docs.google.com/spreadsheets/d/1BDWSm4HGHLoCCmGN1QzoKg-DpDx3CSArQW_p4DIabsk/edit?gid=202783002#gid=202783002

- **Name** (String) - name of the mountain
- **Height** (int) - height of mountain in feet
- **Ascents** (int) - number of successful ascents in feet

## UML Diagram

Put and image of your UML Diagram here. Upload the image of your UML Diagram to your repository, then use the Markdown syntax to insert your image here. Make sure your image file name is one work, otherwise it might not properly get display on this README.

![UML diagram](image.png)

## Video Demo

Record a short video of your abstract art animation to display here on your README. You can do this by:

- Screen record your project running on Code.org.
- Upload that recording to YouTube.
- Take a thumbnail for your image.
- Upload the thumbnail image to your repo.
- Use the following markdown

https://youtu.be/ipdVujwfCc8 
![thumbnail](image-1.png)

## Description
Each mountain's height and number of ascents are split into different "levels" which determine the size of the mountain and the background color of the theater scene.
Represents the Mountain data by using size of the icon and color of the background.Also prints the name, height, and number of successful ascents of the mountain. Picking the color and the size of the image is done by using multiselection statements instead of nested selection statements for efficiency in writing. Also compound boolean expressions make sure that the next mountain is different from the last one.It also plays mountain sounds during the program execution.