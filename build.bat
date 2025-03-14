@echo off
echo Starting Gradle build process...

rem Run Gradle build
cd commons
call gradlew build
if %ERRORLEVEL% neq 0 (
    echo Gradle build failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)

echo Gradle build completed successfully.

rem Define source and destination paths
set SOURCE_FILE=build\libs\commons-plain.jar
set DESTINATION_FOLDER=..\user-service\libs\

rem Create destination folder if it doesn't exist
if not exist "%DESTINATION_FOLDER%" mkdir "%DESTINATION_FOLDER%"

rem Copy the file
echo Copying %SOURCE_FILE% to %DESTINATION_FOLDER%...
copy "%SOURCE_FILE%" "%DESTINATION_FOLDER%"
if %ERRORLEVEL% neq 0 (
    echo File copy failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)

set DESTINATION_FOLDER=..\booking-service\libs\

rem Create destination folder if it doesn't exist
if not exist "%DESTINATION_FOLDER%" mkdir "%DESTINATION_FOLDER%"

rem Copy the file
echo Copying %SOURCE_FILE% to %DESTINATION_FOLDER%...
copy "%SOURCE_FILE%" "%DESTINATION_FOLDER%"
if %ERRORLEVEL% neq 0 (
    echo File copy failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)


set DESTINATION_FOLDER=..\meeting-room-service\libs\

rem Create destination folder if it doesn't exist
if not exist "%DESTINATION_FOLDER%" mkdir "%DESTINATION_FOLDER%"

rem Copy the file
echo Copying %SOURCE_FILE% to %DESTINATION_FOLDER%...
copy "%SOURCE_FILE%" "%DESTINATION_FOLDER%"
if %ERRORLEVEL% neq 0 (
    echo File copy failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)


set DESTINATION_FOLDER=..\gateway\libs\

rem Create destination folder if it doesn't exist
if not exist "%DESTINATION_FOLDER%" mkdir "%DESTINATION_FOLDER%"

rem Copy the file
echo Copying %SOURCE_FILE% to %DESTINATION_FOLDER%...
copy "%SOURCE_FILE%" "%DESTINATION_FOLDER%"
if %ERRORLEVEL% neq 0 (
    echo File copy failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)

rem Change directory to the second project and run Gradle build
echo.
echo Starting Gradle build process for second project...
cd ..\booking-service
call gradlew build
if %ERRORLEVEL% neq 0 (
    echo Second Gradle build failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)


rem Change directory to the second project and run Gradle build
echo.
echo Starting Gradle build process for second project...
cd ..\meeting-room-service
call gradlew build
if %ERRORLEVEL% neq 0 (
    echo Second Gradle build failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)

rem Change directory to the second project and run Gradle build
echo.
echo Starting Gradle build process for second project...
cd ..\user-service
call gradlew build
if %ERRORLEVEL% neq 0 (
    echo Second Gradle build failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)

rem Change directory to the second project and run Gradle build
echo.
echo Starting Gradle build process for second project...
cd ..\notification-service
call gradlew build
if %ERRORLEVEL% neq 0 (
    echo Second Gradle build failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)

rem Change directory to the second project and run Gradle build
echo.
echo Starting Gradle build process for second project...
cd ..\eureka-server
call gradlew build
if %ERRORLEVEL% neq 0 (
    echo Second Gradle build failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)

rem Change directory to the second project and run Gradle build
echo.
echo Starting Gradle build process for second project...
cd ..\gateway
call gradlew build
if %ERRORLEVEL% neq 0 (
    echo Second Gradle build failed with error code %ERRORLEVEL%
    exit /b %ERRORLEVEL%
)

echo Second Gradle build completed successfully.
echo All processes completed.


echo File copied successfully.
echo Process completed.