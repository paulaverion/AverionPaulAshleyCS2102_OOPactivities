# Carbon Footprint Calculator

## I. Project Overview
The **Carbon Footprint Calculator** is an interactive application designed to help users track and reduce their carbon emissions. The tool calculates the environmental impact of daily activities such as electricity usage, vehicle travel, air travel, and waste generation. Users can save their data for future reference, analyze reports of their total emissions, and make informed decisions to minimize their environmental footprint.

This project aligns with **Sustainable Development Goal 12 (SDG 12): Responsible Consumption and Production**, promoting sustainable habits and empowering users to make environmentally conscious decisions.

---

## II. Application of OOP Principles
The Carbon Footprint Calculator leverages core Object-Oriented Programming (OOP) principles to ensure modularity, scalability, and maintainability:

1. **Encapsulation**
   - Each class is designed to encapsulate specific functionality.
   - For example, the `User` class stores user-specific data like name and login credentials, while the `CarbonFootprintCalculator` class handles the carbon footprint calculations.

2. **Abstraction**
   - Abstract classes and interfaces, such as the `CarbonFootprintEntry`, define the blueprint for calculating carbon emissions for various activities.

3. **Inheritance**
   - The `Tourist` class inherits from the `User` class, showcasing the "is-a" relationship and allowing for specialized functionality.

4. **Polymorphism**
   - Methods like `displayInfo()` are overridden in the `Tourist` class to provide customized output.

5. **File Handling and Data Persistence**
   - The `DataPersistence` class enables saving and retrieving user entries in a text file, ensuring that data can be reused and analyzed over time.

---

## III. SDG 12 and Project Integration
### SDG 12: Responsible Consumption and Production
SDG 12 emphasizes reducing waste generation and promoting sustainable consumption practices. The Carbon Footprint Calculator contributes to this goal in the following ways:

- **Awareness and Education**: By providing detailed insights into the user's carbon footprint, the application raises awareness about the impact of daily activities on the environment.
- **Behavioral Change**: Users are encouraged to adopt responsible consumption habits, such as reducing energy use, minimizing air travel, and managing waste.
- **Data-Driven Sustainability**: By saving and analyzing their data, users can track progress over time and set goals for reducing emissions.

---

## IV. Instructions for Running the Program
### Prerequisites
To run this program, ensure you have the following installed on your system:
1. **Java Development Kit (JDK)**: Version 8 or higher
2. A text editor or IDE like IntelliJ IDEA, Eclipse, or Visual Studio Code

### Steps to Run the Program
1. **Clone the Repository**:
   Download or clone the project files to your local machine.

   ```bash
   git clone https://github.com/your-repository/carbon-footprint-calculator.git
   ```

2. **Open the Project**:
   Open the project in your preferred Java IDE.

3. **Compile the Code**:
   Compile all `.java` files using your IDE or the command line. For the command line, navigate to the project directory and run:

   ```bash
   javac *.java
   ```

4. **Run the Main Class**:
   Execute the program by running the `Main` class. If using the command line, type:

   ```bash
   java Main
   ```

5. **Interact with the Program**:
   - Register as a new user and log in.
   - Add daily activity data to calculate your carbon footprint.
   - View detailed reports of your emissions.
   - Save your data for future use.

---

## Additional Notes
- Ensure proper file permissions if saving data to a file.
- This program is designed for educational purposes and should not be used as a replacement for professional carbon footprint assessment tools.

---

Thank you for using the Carbon Footprint Calculator! Together, we can make a positive impact on the planet.

