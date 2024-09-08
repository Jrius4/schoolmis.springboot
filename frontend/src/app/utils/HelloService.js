import axios from "axios";

const API_URL = process.env.REACT_APP_API_URL || "http://localhost:8080";


export const getHelloMessage = async ()=>{
    try {
        const response = await axios.get(`${API_URL}/hello`);
        return response.data;
    } catch (error) {
        console.error("Error fetching hello message:", error.message);
        throw error;
    }
}