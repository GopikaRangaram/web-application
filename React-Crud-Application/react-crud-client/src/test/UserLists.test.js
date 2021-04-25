import React from "react";
import { render, unmountComponentAtNode } from "react-dom";
import{ act } from "react-dom/test-utils";
import UserLists from "../components/UserLists";

let container = null;

beforeEach(() => {
    container =  document.createElement("div");
    document.body.appendChild(container);
});

afterEach(() => {
    unmountComponenetAtNode(container);
    container.remove();
    cotainer=null;
});

it("renders user data", async() => {
    const fakeUser = {
        userName: "someOne",
        emailId: "someOne@aspire.com",
        pasword: "someOne123"
    };
    jest.spyOn(global,"fetch").mockImplementation(() => Promise.resolve ({
        json: () =>
        Promise.resolve(fakeUser)
    }));

    await act(async() => {
        render(<UserLists id="" />,
        container);
    });

    expect(container.querySelector("summary").textContent).toBe(fakeUser.userName);
    expect(container.querySelector("summary").textContent).toBe(fakeUser.emailId);
    global.fetch.mockRestore();
})