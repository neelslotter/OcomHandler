# OcomHandler PCAPS decoding

This project implements a Java-based client for interfacing with Oracle's OCOM REST API, handling HTTP requests and responses, and managing data from Oracle communication calls. It includes various helper classes to format, filter, and process data from Oracle's OCOM API.

## Table of Contents

- [Project Overview](#project-overview)
- [Features](#features)
- [Prerequisites](#prerequisites)
- [Usage](#usage)
- [Code Structure](#code-structure)
- [Configuration](#configuration)
- [Author](#author)

## Project Overview

This project connects to Oracle's OCOM API to retrieve call and monitoring data. It is implemented with Java, using the `okhttp3` library for HTTP requests, and the `Gson` library for JSON handling. The application reads a configuration file (`app.conf`) to set default URLs and access tokens.

## Features

- **HTTP Client**: Manages connections to Oracle OCOM REST API endpoints.
- **Data Parsing**: Handles JSON responses and maps them to Java objects.
- **Configuration**: Reads configuration from a file for flexibility.
- **Error Handling**: Implements basic error handling for network and parsing errors.

## Prerequisites

- **Java 11 or above**
- **Gson** and **okhttp3** libraries (included via Maven or other dependency manager)
- Network access to Oracle's OCOM API

## Usage

1. **Configure the Application**: Update the `app.conf` file with your specific Oracle API URL and key.
2. **Run the Main Program**: Execute the `Main` class, providing required command-line arguments:
   ```bash
   java Main <source_number> <start_time>
