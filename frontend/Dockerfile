# Use the official Node.js image as the base image
FROM node:18-alpine as build
# Set the working directory inside the container
WORKDIR /app
COPY package*.json ./
RUN npm install
RUN npx ngcc --properties es2023 browser module --first-only --create-ivy-entry-points
# Copy the rest of the application code into the working directory
COPY . .
# Build the Angular app for production
RUN npm run build
# Use an official NGINX image to serve the Angular app
FROM nginx:stable-alpine
COPY default.conf /etc/nginx/conf.d/
# Copy the build output to the NGINX web server directory
COPY --from=build /app/dist/frontend/browser /usr/share/nginx/html
# Expose port 80
EXPOSE 80
# Start NGINX
CMD ["nginx", "-g", "daemon off;"]
