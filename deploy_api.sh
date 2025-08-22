#!/bin/bash

mvn clean package

# Set your Tomcat path
TOMCAT_HOME="/home/sudhanshu/apache-tomcat-11.0.9"
WAR_SOURCE="./target"
WAR_FILE=$(ls ${WAR_SOURCE}/*.war 2>/dev/null)

# Validate WAR file
if [ ! -f "$WAR_FILE" ]; then
  echo "❌ WAR file not found in $WAR_SOURCE"
  exit 1
fi

# Stop Tomcat if running
echo "🛑 Stopping Tomcat..."
$TOMCAT_HOME/bin/shutdown.sh
sleep 5

# Clean webapps directory
echo "🧹 Cleaning webapps directory..."
rm -rf $TOMCAT_HOME/webapps/*
rm /home/sudhanshu/apache-tomcat-11.0.9/logs/*
# Copy WAR to Tomcat
echo "📦 Deploying WAR: $WAR_FILE"
cp "$WAR_FILE" $TOMCAT_HOME/webapps/

# Start Tomcat
echo "🚀 Starting Tomcat..."
$TOMCAT_HOME/bin/startup.sh

echo "✅ Deployment complete. Check logs at $TOMCAT_HOME/logs/catalina.out"
