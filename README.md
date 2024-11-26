# JayanthaHardware - POS System

JayanthaHardware is a Java Swing-based invoicing application (POS System) developed for the company **Jayantha Hardware**. This application manages customer invoices, generates PDF reports, tracks profits, and handles various sales and service-related functionalities. 

---

## Features

- **Splash Screen**: Appears on the first launch.
- **Invoice Management**: Create and save invoices as PDF files.
- **Customer Management**: Add and manage customer records.
- **Graphical User Interfaces (GUIs)**:
  - Home GUI
  - Invoice GUI
  - Other Services GUI
  - Services GUI
  - Payment Type GUI
  - Profit GUI
  - Sales GUI
  - GRN (Goods Received Note) GUI
- **Logging**: Logs any errors in the application.
- **Report Generation**: Uses JasperSoft Community Edition to create PDF reports for invoices and GRNs.
- **Database Integration**: Uses MySQL for storing and retrieving application data.

---

## Setup Instructions

1. **Download and Extract Files**
   - Clone or download the repository from GitHub.
   - Navigate to the `dist` folder and extract its contents.

2. **First Launch**
   - Run the `.exe` file located in the extracted `dist` folder.
   - A splash screen will appear on the first run.

3. **Configure Database**
   - Close the application after the splash screen.
   - Navigate to the following directory:  
     `C:\Users\YOUR_USER_NAME\JayanthaHardware`
   - Open `variables.txt` and enter the following details:
     - Database Username
     - Database Password
     - Database Name
     - Database Port

4. **Initial Database Setup**
   - Use MySQL Workbench or any preferred MySQL editor to add the first user manually.

5. **Running the Application**
   - Reopen the application using the `.exe` file.

---

## Files and Directories

- **`dist/`**: Contains the application `.exe` file for direct execution.
- **`lib/`**: Includes all required libraries for the application.
- **`variables.txt`**: Stores database connection details (username, password, database name, port).
- **`invoice/`**: Saves PDFs of generated invoices.
- **`logs/`**: Stores logs for debugging purposes.
- **`grn/`**: Saves GRN PDFs.
- **`sql/`**: SQL file for setting up the database structure.
- **`launch4j.xml`**: Configuration file for Launch4j.

---

## Technologies Used

- **Java Swing**: For the graphical user interface.
- **MySQL**: For database management.
- **JasperSoft Community Edition**: For generating PDF reports.
- **NetBeans**: IDE for development.

---

## How to Modify the Project

1. Open the project in NetBeans.
2. Modify the source code as required.
3. Use the `sql/` file to reset or modify the database schema if necessary.
4. Rebuild the `.exe` file using `launch4j.xml`.

---

## Notes

- First-time users must manually add the first user in the database.
- Ensure all libraries in the `lib/` folder are included in the classpath.
- Refer to the `logs/` directory for troubleshooting application errors.

---

## Contributing

If you’d like to contribute to the project, fork the repository and create a pull request with your changes.

---

## License

This project is licensed under MIT License.

---

## Author

**Sandaru Gunathilake**
