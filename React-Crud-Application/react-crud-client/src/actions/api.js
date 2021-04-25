import axios from "axios";

const baseUrl = "http://localhost:9001/"

export default {
    userList(url=baseUrl+'RegisterationController'){
        return{

            fetchAll: () => axios.get(url),
            fetchById: id => axios.get(url+id),
            create : newRecord => axios.post(url,newRecord),
            update : (id,updatedRecord) => axios.patch(url + '/' + id,updatedRecord),
            delete : id => axios.delete(url + '/' + id)

        }
    }
}