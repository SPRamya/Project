import axios from 'axios';
import React, { useEffect, useState } from 'react'
import { Link, useParams } from 'react-router-dom'
export default function ViewUser() {
    const[user,setUser]=useState({
        name:"",
        username:"",
        email:"",
        address:"",
        brand:"",
        colour:"",
        mileage:"",
        model:"",
        phno:"",
        price:""
    })
    const {id}=useParams();
    useEffect(()=>{
        loadUser();
    },[]);


        const loadUser=async ()=>{
            const result=await axios.get(`http://localhost:8080/appost/${id}`)
            setUser(result.data)
        }
  return (
    <div className="container">
    <div className="row">
        <div className="col-md-6 offset-md-3 border rounded p-4 mt-2 shadow">
            <h2 className="text-center m-4">User Details</h2>
            <div className="card">
                <div className="card-header">
                    Details of user id:{user.id}
                    <ul className="list-group list-group-flush">
                        <li className="list-group-item">
                            <b>Name:</b>
                            {user.name}
                        </li>
                        <li className="list-group-item">
                            <b>UserName:</b>
                            {user.username}
                        </li>
                        <li className="list-group-item">
                            <b>Email:</b>
                            {user.email}
                        </li>
                        <li className="list-group-item">
                            <b>Address:</b>
                            {user.address}
                        </li>
                        <li className="list-group-item">
                            <b>Brand:</b>
                            {user.brand}
                        </li>
                        <li className="list-group-item">
                            <b>Colour:</b>
                            {user.colour}
                        </li>
                        <li className="list-group-item">
                            <b>Mileage:</b>
                            {user.mileage}
                        </li>
                        <li className="list-group-item">
                            <b>Model:</b>
                            {user.model}
                        </li>
                        <li className="list-group-item">
                            <b>phno:</b>
                            {user.phno}
                        </li>
                        <li className="list-group-item">
                            <b>Price:</b>
                            {user.price}
                        </li>
                    </ul>
                </div>
            </div>
            <Link className="btn btn-primary my-2" to={"/home"}>
                Back to Home
            </Link>
            </div>
            </div>
            </div>
  )

  }